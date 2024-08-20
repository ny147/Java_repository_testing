create table accounts (

    id serial primary key,
    username varchar ( 50 ) unique not null,
    password varchar (50) not null,
    email varchar ( 255) unique not null,
    created_on timestamp not null,
    last_login timestamp

);