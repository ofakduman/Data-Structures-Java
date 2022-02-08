5. You have a sizable collection of music and videos and want to develop a database for storing and 
processing information about this collection. You need to develop a class hierarchy for your media 
collection that will be helpful in designing the database. Try the class hierarchy shown in Figure 1.11, 
where Audio and Video are media categories. Then CDs and cassette tapes would be subclasses of 
Audio, and DVDs and VHS tapes would be subclasses of Video.
If you go to the video store to get a movie, you can rent or purchase only movies that are recorded 
on VHS tapes or DVDs. For this reason, class Video (and also classes Media and Audio) should be 
abstract classes because there are no actual objects of these types. However, they are useful classes to 
help define the hierarchy.
Class Media should have data fields and methods common to all classes in the hierarchy. Every 
media object has a title, major artist, distributor, playing time, price, and so on. Class Video should 
have additional data fields for information describing movies recorded on DVDs and videotapes. 
This would include information about the supporting actors, the producer, the director, and the 
movie’s rating. Class DVD would have specific information about DVD movies only, such as the 
format of the picture and special features on the disk. Figure 1.12 shows a possible class diagram for 
Media, Video, and subclasses of Video.

Provide methods to load the media collection from a file and write it back out to a file. Also, provide 
a method to retrieve the information for a particular item identified by its title and a method to 
retrieve all your items for a particular artist.