create table packages(
  trackingNumber VARCHAR (256) primary key not null ,
  addressee VARCHAR (256) not null,
  telephone VARCHAR (256) not null,
  weight VARCHAR (256) not null,
  state VARCHAR (256) not null,
  dateTime VARCHAR (256)
)