# About Dataset

Data is sourced from [Information is Beautiful](https://docs.google.com/spreadsheets/d/1cz7TDhm0ebVpySqbTvrHrD3WpxeyE4hLZtifWSnoNTQ/edit#gid=21), with the graphic coming from the same group [here](https://twitter.com/infobeautiful/status/1216765612439019521?s=20).

There's lots of additional information about password quality & strength in the source Doc. Please note that the "strength" column in this dataset is relative to these common aka "bad" passwords and YOU SHOULDN'T USE ANY OF THEM!

Wikipedia has a nice article on password strength as well.

Data Dictionary
passwords.csv
| variable          | class     | description                                                                                                                           |
|-------------------|-----------|---------------------------------------------------------------------------------------------------------------------------------------|
| rank              | double    | popularity in their database of released passwords                                                                                    |
| password          | character | Actual text of the password                                                                                                           |
| category          | character | What category does the password fall in to?                                                                                           |
| value             | double    | Time to crack by online guessing                                                                                                      |
| time_unit         | character | Time unit to match with value                                                                                                         |
| offline_crack_sec | double    | Time to crack offline in seconds                                                                                                      |
| rank_alt          | double    | Rank 2                                                                                                                                |
| strength          | double    | Strength = quality of password where 10 is highest, 1 is lowest, please note that these are relative to these generally bad passwords |
| font_size         | double    | Used to create the graphic for KIB                                                                                                    |