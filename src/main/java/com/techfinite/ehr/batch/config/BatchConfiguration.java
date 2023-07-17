package com.techfinite.ehr.batch.config;

import com.techfinite.ehr.conversion.source.schema.MediRecordPatient;
import com.techfinite.ehr.conversion.target.schema.BPSEHRV2;
import com.techfinite.ehr.xml.writer.NoRootStaxEventItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Autowired
    public BatchConfiguration(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
    }

    @Bean
    @StepScope
    public JsonItemReader<MediRecordPatient> itemReader(@Value("#{jobParameters['patient_file']}") String patientFile) throws UnexpectedInputException, ParseException {
        var reader = new JsonItemReader<MediRecordPatient>();
        reader.setJsonObjectReader(new JacksonJsonObjectReader<>(MediRecordPatient.class));
        reader.setResource(new ClassPathResource(patientFile));
        return reader;
    }

    @Bean(destroyMethod = "")
    @StepScope
    public ItemWriter<BPSEHRV2> itemWriter(Marshaller marshaller,@Value("#{jobParameters['output_file']}") String outputFile) {
        var itemWriter = new NoRootStaxEventItemWriter<BPSEHRV2>();
        itemWriter.setMarshaller(marshaller);
        itemWriter.setResource(new FileSystemResource(outputFile));
        itemWriter.open(new ExecutionContext());
        return itemWriter;
    }

    @Bean
    public Marshaller marshaller() {
        var marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(BPSEHRV2.class);
        return marshaller;
    }

    @Bean
    protected Step step1(ItemReader<MediRecordPatient> reader,
                         ItemProcessor<MediRecordPatient, BPSEHRV2> processor,
                         ItemWriter<BPSEHRV2> writer) {
        return stepBuilderFactory
                .get("step1")
                .<MediRecordPatient, BPSEHRV2>chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean(name = "ehrGenerateJob")
    public Job job(@Qualifier("step1") Step step) {
        return jobBuilderFactory
                .get("ehrGenerateJob")
                .start(step)
                .build();
    }
}