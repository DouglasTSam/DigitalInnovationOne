package one.innovation.digital.desenvolvimentoBasicoECollections.desenvolvimentoBasicoEmJava.caracteristicasDaLinguagemJava1.classes.usuarios;

public class SuperUsers {

        private String login;
        private String password;
        String name;

        public SuperUsers(final String login, final String password){
            this.login = login;
            this.password = password;
        }

        public String getLogin(){
            return login;
        }

        protected String getPassword(){
            return password;
        }


}
