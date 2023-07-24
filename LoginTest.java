class LoginTest{
    public boolean isMember (String id, String pwd) {
        if (id.equals("tiger") && pwd.equals("1234")){
            return true;
        } 
        return false;
	}

}
