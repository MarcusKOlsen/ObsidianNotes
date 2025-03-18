---
updated_at: 2025-03-18T13:22:39.094+01:00
edited_seconds: 300
---
# Definition
Functions are a way to save multiple actions into what is essentially a value, that can be reused. Very similar to functions in programming languages.

## Pseudocode
``` PostgreSQL
CREATE FUNCTION name([arguments])
RETURNS [TRIGGER type] AS 
$$function definition$$ LANGUAGE lang;
```

## Example
``` PostgreSQL
CREATE FUNCTION add(int,int) -> the name and arguments
RETURNS int AS $$select $1+$2; $$ -> What ever you want the actions to do
LANGUAGE SQL; -> You have to specify the language for some reason
```

``` PostgreSQL
CREATE FUNCTION add(i1 int, i2 int)
RETURNS int as $$ BEGIN RETURN i1 + i2; END; $$
LANUAGE plpqsql -> /* This is a language that is apparently understood by postgresql */
```
