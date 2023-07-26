package com.techfinite.ehr.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping(path = "/ehr/api/v1")
public class EHRApiController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job ehrGenerateJob;

    @PostMapping("/launch")
    public ResponseEntity<String> launch(@RequestParam("patient_file") String inputFile, @RequestParam("output_file") String outputFile) throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("patient_file", inputFile)
                .addString("output_file", outputFile)
                .addDate("date",new Date())
                .toJobParameters();
        // launch job only if file exists in DB and is not processed
        final JobExecution jobExecution = jobLauncher.run(ehrGenerateJob, jobParameters);
        return ResponseEntity.status(HttpStatus.OK).body("Success");
    }
}
