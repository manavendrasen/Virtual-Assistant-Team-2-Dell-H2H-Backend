# Spring Boot API services 


i)"/orders/{orderId}" ---> GET

Fetch order details and show error details alongside if found

Details returned (If error found):-
1)erroId
2)errorName
3)issueId
4)orderId
5)orderDate
6)quantity
7)productname
8)imageUrl
9)price
10)productDesc(product description)
11)OrderStatus

Details returned(If no error found):
1)orderId
2)orderDate
3)quantity
4)productname
5)imageUrl
6)price
7)productDesc(product description)
8)OrderStatus

ii)"/orders/{orderID}/{issueID}/{errorID}"  --->POST

Fraud list added in backend and have allowed springboot to update

Body:-
1)orderEmail-To update email
2)zipCode-To update zip



iii)"/graph/{StartDate}/{EndDate}" --->GET

Details returned:-
1)issueDate :- Date in  between StartDate and EndDate
2)EmailErrors :- No. of email errors on issueDate
3)ZipErrors  :- No. of zip errors on issueDate
4)fraudList  :-No. of fraud email lists on issueDate

iv)"/pie/{StartDate}/{EndDate}" --->GET

Details returned:-
1)totalEmailErrors :- No. of email errors between StartDate and EndDate
2)totalZipErrors  :- No. of zip errors between StartDate and EndDate
3)totalfraudMails :-No. of fraud email lists between startDate and EndDate

v)"/location/{StartDate}/{EndDate}" --->GET

Details returned:-
1)location :-location of generated errors between StartDate and EndDate
2)emailErrors :- No. of email errors on issueDate
3)zipErrors  :- No. of zip errors on issueDate
4)fraudList  :-No. of fraud email lists on Location

vi)"/month/{StartDate}/{EndDate}" --->GET

Details returned:-
1)Month no. :- Month no. of all months in  between StartDate and EndDate
2)EmailErrors :- No. of email errors on issueDate
3)ZipErrors  :- No. of zip errors on issueDate
4)fraudList  :-No. of fraud email lists on Location


vii)"/table/{StartDate}/{EndDate}" --->GET

Details returned:-

1)orderId
2)issueId
3)orderEmail
4)zipCode
5)country
6)issueDate
7)errorName
8)isResolved


Had implemented this API for the Chat Bot 
