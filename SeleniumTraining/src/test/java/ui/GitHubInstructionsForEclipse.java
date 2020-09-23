// When connecting a new eclipse workspace/ project to Eclipse I found some good instructions at:
//  http://www.geo.uzh.ch/microsite/reproducible_research/post/rr-eclipse-git/
// Note I didn't need to download EGit. 

// To update GitHub with updated or new java files
// In Eclipse goto your java files in Package Explorer (under the ui)
// Highlight the files you want to update github with
// Right-click and Export
// Click Next and Finish because the details of your local git repository in users/richy/git etc are prefilled.

// Next in Package Explorer goto SeleniumJava-Eclipse- and expand it to show the current files in sync with local repsitory
// Right-click and select Refresh.
// The files you just exported to your local directory will now appear here

// Goto Window > Show View > Other and select Git Repositories and click Open button
// Expand the Git Repositories window that has appeared on the bottom left of the screen
// Right-Click SeleniumJava-Eclipse- and select Commit
// A Git Staging Window will appear bottom left. Expand it or make it bigger
// In the Unstaged section hover over the files and click the green + that will move the files to Staged changes
// The Commit and Push button will now appear
// Enter a Commit comment ie Adding file called ...
// Click the button 
// Popup appears. Click Preview Button
// In top section you can expand details and see your file
// CLick Push Button
// On the bottom right you should see a % complete progress bar
// Window will pop up to say its done. 
// Again you can expand details to see the file that has just been pushed
// Click the Close button
// Check that your files have gone into remote/online github