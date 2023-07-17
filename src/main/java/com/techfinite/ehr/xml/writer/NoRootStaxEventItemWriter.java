package com.techfinite.ehr.xml.writer;

import org.springframework.batch.item.xml.StaxEventItemWriter;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

/**
 * {@link StaxEventItemWriter} which write no root tag as written elements are root
 * @param <T> Type of the written elements
 *
 * @author francois.dupire
 */
public class NoRootStaxEventItemWriter<T> extends StaxEventItemWriter<T> {

    /*
     * Methods
     */
    @Override
    protected void startDocument(XMLEventWriter writer) throws XMLStreamException {
        XMLEventFactory factory = createXmlEventFactory();

        // write start document
        writer.add(factory.createStartDocument(getEncoding(), getVersion()));
    }


    @Override
    protected void endDocument(XMLEventWriter writer) { }

}