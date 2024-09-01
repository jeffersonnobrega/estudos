USE wordpress;
CREATE USER wp_user FOR LOGIN wp_user;
EXEC sp_addrolemember N'db_owner', N'wp_user';
