package cgv_controller;

import java.util.ArrayList;

import cgv_model.MovieDTO;

public class MovieController {
    ArrayList<MovieDTO> list;
    int index;
    
    public MovieController() {
        list = new ArrayList<>();
        index = 1;
        
    }
    
    //개별보기할  int userChoice = index
    /*
    private ArrayList<MovieDTO> selectAll(int userChoice) {
        
        for ( int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIndex() + ". " + list.get(i).getTitle());
            System.out.println("----------------------------------------");
        }
    }
   
    
    private void printOneByIndex(int index) {
        if (validateIndex(index)) {
            for (MovieDTO m : list) {
                if(m.getIndex() == index) {
                    System.out.printf("%d. %s\t%s\t%s", m.getIndex(), 
                            m.getTitle(), m.getSummary(), m.getRate()); 
                }
            }
        }
        
    }*/
    
    private boolean validateIndex(int index) {
        if(list.contains(index)) {
            return true;
        }
        return false;
    }
    
    
    private void add(MovieDTO m) {
        String message;
        if (m.getRate().equals("1")) {
            message = new String("전체 관람가");
            m.setRate(message);
        } else if (m.getRate().equals("2")) {
            message = new String("12세 이상 관람가");
            m.setRate(message);
        } else if (m.getRate().equals("3")) {
            message = new String("15세 이상 관람가");
            m.setRate(message);
        } else if (m.getRate().equals("4")) {
            message = new String("19세 이상 관람가");
            m.setRate(message);
        }
         
        m.setIndex(index++);
        
        list.add(m);
    }
    
    private void update(MovieDTO updated) {
        String message;
        for ( MovieDTO m : list) {
            if (m.getIndex() == updated.getIndex()) {
                m.setTitle(updated.getTitle());
                m.setSummary(updated.getSummary());
                if (updated.getRate().equals("1")) {
                    message = new String("전체 관람가");
                    m.setRate(message);
                } else if (updated.getRate().equals("2")) {
                    message = new String("12세 이상 관람가");
                    m.setRate(message);
                } else if (updated.getRate().equals("3")) {
                    message = new String("15세 이상 관람가");
                    m.setRate(message);
                } else if (updated.getRate().equals("4")) {
                    message = new String("19세 이상 관람가");
                    m.setRate(message);
                }
            }
        }
    }
    
    
}
