# Setup
Create a new Apps Script project via https://script.google.com/home

Install Clasp through NPM:
`npm install -g @google/clasp`

Then enable the Google Apps Script API: https://script.google.com/home/usersettings

You must first login to authenticate clasp

`clasp login`

Clone the project from Google Apps Scripts to get the .clasp.json & appscript.json
files used by the clasp CLI to upload to GAS. To see your Apps Script project script ID,
open the project in the web editor, then click *Project Settings* to find the script ID.

`clasp clone SCRIPT_ID`

For more info on the Clasp CLI see: https://github.com/google/clasp