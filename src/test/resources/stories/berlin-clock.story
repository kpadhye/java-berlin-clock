Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase then number of ways that I can read the time

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 24:00:00
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO

Scenario: Random early morning time
When the time is 03:58:33
Then the clock should look like
O
OOOO
RRRO
YYRYYRYYRYY
YYYO

Scenario: Random morning time
When the time is 10:15:23
Then the clock should look like
O
RROO
OOOO
YYROOOOOOOO
OOOO

Scenario: Random afternoon time
When the time is 16:47:18
Then the clock should look like
Y
RRRO
ROOO
YYRYYRYYROO
YYOO

Scenario: Random evening time
When the time is 21:30:55
Then the clock should look like
O
RRRR
ROOO
YYRYYROOOOO
OOOO
