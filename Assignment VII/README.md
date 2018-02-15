# Assignment 7

## Media App

Create a class called DrawImageControlPanel.  Modify the code presented in the Module 5 slides (also posted separately on the Resources page) such that this new JPanel is integrated as part of the application. You are integrating the new functionality, not replacing!

Add a menu item named Show Picture to the File menu that will show the image of a Picture object.  This image should be displayed within the new JPanel. To do this, look for a method that allows you to “get” the image from the Picture object. When that menu item is selected another menu named Image should be displayed that allows image manipulation operations to be performed. Support at least two image manipulation operations. These can be the same operations that you have used previously, or they can be new ones.

Add another menu item to the File menu that "loads" a Sound object.  When that menu item is selected another menu named Sound should be displayed that allows sound operations to be performed. Support at least two sound operations. The first operation is to play the sound. The second operation is to play the mirror of the sound.

Add one more feature, for example a new image operation or a new sound operation. You will need to add at least one additional menu item to the Image or Sound menu to allow for the selection of this additional operation. If it makes sense, given the feature you are adding, you may want to add an additional menu item to the File menu as well.

Any resource (.jpg and .wav) files used by your application should be selected by the user via the FileChooser class.

Submit all modified .java files and all resource (.jpg and .wav) files. Please be careful, as you likely modified the Picture class, and/or SimplePicture class, and/or Sound class, etc. Any class that is no longer the same as the MediaComputation baseline needs to be submitted. Also, do not use absolute filenames! Any filenames you use should be relative. That way, I won’t need to modify your code to get it to run on my system. Submit these files together as a single zipped attachment. Please use the zip format (not .rar or any other format).
