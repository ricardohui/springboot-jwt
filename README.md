
# 

To authenticate
create a POST reuqest to  `localhost:8080/authenticate` with this body
```json
{
"username": "javainuse",
"password": "password"
}
```

cURL with your token
```
curl --location --request GET 'localhost:8080/hello' \
--header 'Authorization: Bearer TOKEN_HERE'
```


If you have this error
https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception