package controller;

public class NumList {
    public void setNumList(ComNumList comNumList, UserNumList userNumList) {
        RandomNum randomNum = new RandomNum();
        comNumList.setComNumList(randomNum);

        UserInput input = new UserInput();
        userNumList.setUserNumList(input);
    }
}
