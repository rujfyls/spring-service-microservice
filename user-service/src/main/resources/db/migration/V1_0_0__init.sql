create TABLE users_db (
    id  bigserial not null,
    e_mail varchar(255) not null,
    password varchar(255) not null,
    username varchar(255) not null,
    case_for_user varchar(500) not null,
    created_at TIMESTAMP not null,
    primary key (id)
);
