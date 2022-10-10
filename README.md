# market-spring

## URL Heroku
http://platzimarket-springboot.herokuapp.com/market/api/v1/

### Authentication 
http://platzimarket-springboot.herokuapp.com/market/api/v1/auth/authenticate

sending the following body in a POST request to get the token

`{
"username": "gian",
"password": "gian"
}`

with the token you can access to the API, for example to the endpoint: http://platzimarket-springboot.herokuapp.com/market/api/v1/products
sending the token obtained or using CURL:
`curl --location --request GET 'http://platzimarket-springboot.herokuapp.com/market/api/v1/products' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJnaWFuIiwiaWF0IjoxNjY1NDIyMDEwLCJleHAiOjE2NjU0NTgwMTB9.oTFrrn4L1fdRiT3jKFrPu5ZEEbIT9whXgxp-MBz5ryA'`



