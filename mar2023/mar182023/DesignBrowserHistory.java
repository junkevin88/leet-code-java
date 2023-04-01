package mar2023.mar182023;

import java.util.ArrayList;
import java.util.List;

public class DesignBrowserHistory {
    private List<String> history;
    private int currentIndex;

    public DesignBrowserHistory(String homepage) {
        this.history = new ArrayList<>();
        this.history.add(homepage);
        this.currentIndex = 0;
    }

    public void visit(String url) {
        // Remove all URLs after the current index
        int last = history.size() - 1;
        while (last > currentIndex) {
            history.remove(last--);
        }
        // Add the new URL to the end of the history
        history.add(url);
        currentIndex = history.size() - 1;
    }

    public String back(int steps) {
        currentIndex = Math.max(currentIndex - steps, 0);
        return history.get(currentIndex);
    }

    public String forward(int steps) {
        currentIndex = Math.min(currentIndex + steps, history.size() - 1);
        return history.get(currentIndex);
    }
}
