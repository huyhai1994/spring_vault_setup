listener "tcp" {
  address     = "0.0.0.0:8200"
  tls_disable = true
}

storage "mysql" {
  username                     = "user"
  password                     = "1234"
  database                     = "vault_demo_db"
  address                      = "mysql:3306"
  plaintext_connection_allowed = true
}

ui = true