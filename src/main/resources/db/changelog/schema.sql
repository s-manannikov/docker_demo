create table message(
    id serial primary key,
    message text
);

insert into message (message) values ('test message');