package com.javaex.practice05;


public class Ex03 {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year; 
	private int track;
	
	public Ex03() {
		System.out.println("Song(파라미터0개)");
	}
	
    public Ex03(String title, String artist, 
    		String album, String composer, String year) {
    	this.title = title;
    	this.artist = artist;
    	this.album = album;
    	this.composer = composer;
    	this.year = year;
    	System.out.println("Song(파라미터5개)");	
    }
    
    public Ex03(String title, String artist, 
    		String album, String composer, String year, int track) {
    	this(title, artist, album, composer, year);
    	this.track = track;
    	System.out.println("Song(파라미터6개)");
    }
	
}


