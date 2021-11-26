docker cp  test.ldif ldap:/
docker exec -it ldap ldapadd -w 'user'  -D "cn=admin,dc=test,dc=gr" -f /ldap/test.ldif
