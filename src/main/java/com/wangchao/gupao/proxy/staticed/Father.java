package com.wangchao.gupao.proxy.staticed;

public class Father {

    private Person person;

    public Father(Person person){
        this.person = person;
    }

    public void findLove(){
        System.out.println("根据要求物色");
        person.findLove();
        System.out.println("物色成功");
    }

}
