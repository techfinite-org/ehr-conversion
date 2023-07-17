package com.techfinite.ehr.conversion.source.schema;

public class PatientRelationship
{
    private PatientRelationshipData[] data;

    private String last;

    private String numberOfElements;

    private String size;

    private String totalPages;

    private String page;

    private String first;

    private String totalElements;

    public PatientRelationshipData[] getData ()
    {
        return data;
    }

    public void setData (PatientRelationshipData[] data)
    {
        this.data = data;
    }

    public String getLast ()
    {
        return last;
    }

    public void setLast (String last)
    {
        this.last = last;
    }

    public String getNumberOfElements ()
    {
        return numberOfElements;
    }

    public void setNumberOfElements (String numberOfElements)
    {
        this.numberOfElements = numberOfElements;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    public String getTotalPages ()
    {
        return totalPages;
    }

    public void setTotalPages (String totalPages)
    {
        this.totalPages = totalPages;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getFirst ()
    {
        return first;
    }

    public void setFirst (String first)
    {
        this.first = first;
    }

    public String getTotalElements ()
    {
        return totalElements;
    }

    public void setTotalElements (String totalElements)
    {
        this.totalElements = totalElements;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", last = "+last+", numberOfElements = "+numberOfElements+", size = "+size+", totalPages = "+totalPages+", page = "+page+", first = "+first+", totalElements = "+totalElements+"]";
    }
}
	