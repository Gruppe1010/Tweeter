package com.example.tweeter.models;

import java.util.Date;

public class Twit
{
    private Date creationDate;
    private String author;
    private String twitText;
    private String publicOrPrivate;

    // constructor
    public Twit(Date creationDate, String author, String twitText, String publicOrPrivate)
    {
        this.creationDate = creationDate;
        this.author = author;
        this.twitText = twitText;
        this.publicOrPrivate = publicOrPrivate;
    }

    public Twit() {}
    
    // getters og setters
    public Date getCreationDate()
    {
        return creationDate;
    }
    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getPublicOrPrivate()
    {
        return publicOrPrivate;
    }
    public void setPublicOrPrivate(String publicOrPrivate)
    {
        this.publicOrPrivate = publicOrPrivate;
    }
    public String getTwitText()
    {
        return twitText;
    }
    public void setTwitText(String twitText)
    {
        this.twitText = twitText;
    }
    
    // Andre metode
    public String getTwitTextWithCitation()
    {
        return "\"" + twitText + "\"";
    }
    
}
