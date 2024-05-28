package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class FlashCardDeck {
    private List<FlashCard> cards;
    private int currentIndex = 0;

    public FlashCardDeck() {
        cards = new ArrayList<>();
        loadCards();
    }

    private void loadCards() {
        cards.add(new FlashCard("What economic concept suggests that expectations about the future are driven by emotions?", "Animal Spirits"));
        cards.add(new FlashCard("Which economic concept describes people forming future expectations based on past events?", "Adaptive Expectations"));
        cards.add(new FlashCard("What theory assumes individuals forecast future conditions using all available information?", "Rational Expectations"));
        cards.add(new FlashCard("What rule adjusts interest rates based on inflation and unemployment differences from targets?", "Taylor Rule"));
        cards.add(new FlashCard("What does an increase in markup affect in terms of wage, employment, and output?", "Decreases real wage and employment, increases unemployment, decreases output"));
        cards.add(new FlashCard("What does the interest parity condition explain?", "Difference in interest rates between two countries equals expected change in exchange rates"));
        cards.add(new FlashCard("What effect does a higher domestic interest rate have on the exchange rate?", "Leads to a higher exchange rate"));
        cards.add(new FlashCard("How does an increase in interest rates affect output and investment through the exchange rate?", "Reduces output and investment"));
        cards.add(new FlashCard("What happens to output and the exchange rate if government spending increases and interest rates are unchanged?", "Output increases, exchange rate unchanged"));
        cards.add(new FlashCard("What are the effects of a policy mix on domestic output and foreign exchange rates?", "Ambiguous on output, increases domestic and exchange rates"));
        cards.add(new FlashCard("What are indexed contracts and their purpose?", "Agreements to adjust wages based on inflation to protect purchasing power"));
        cards.add(new FlashCard("How does a reduction in indexed contracts affect employment and inflation?", "Initially increases employment and reduces inflation, but leads to higher future inflation"));
        cards.add(new FlashCard("What is represented by the IS Curve in economic terms?", "Equilibrium in the goods market"));
        cards.add(new FlashCard("What does the LM Curve represent?", "Equilibrium in the money market"));
        cards.add(new FlashCard("What is the Phillips Curve's relationship between unemployment and inflation?", "Lower unemployment leads to higher inflation"));
        cards.add(new FlashCard("What is stagflation?", "Low output combined with high inflation"));
        cards.add(new FlashCard("What are the effects of an oil price increase on production costs and inflation?", "Increases production costs and inflation"));
        cards.add(new FlashCard("How does a reduction in oil prices affect the real interest rate?", "Reduces the real interest rate"));
        cards.add(new FlashCard("What is the relationship between the natural unemployment rate and inflation?", "Constant inflation at natural unemployment rate"));
        cards.add(new FlashCard("What are the effects of increased consumer confidence on output and inflation in the short run?", "Increases output and inflation"));
        cards.add(new FlashCard("How does increased consumer confidence affect the economy in the medium run?", "May lead to higher real interest rates to cool down the economy"));
        cards.add(new FlashCard("What is a liquidity trap and how do central banks respond?", "Interest rates near zero, ineffective monetary policy; response includes unconventional policies like quantitative easing"));
        cards.add(new FlashCard("What happens to interest rates during an open market sale of bonds?", "Interest rates increase"));
        cards.add(new FlashCard("What does the efficiency wage theory suggest about wage levels and productivity?", "Higher wages increase productivity; too low wages decrease it"));
        cards.add(new FlashCard("Why is maintaining a positive expected rate of inflation at the zero lower bound important?", "Keeps real borrowing costs low, offsets risk premium increases"));
        cards.add(new FlashCard("What is a wage price spiral?", "Cycle of rising wages leading to higher prices, and vice versa"));
        cards.add(new FlashCard("What happens in a deflation spiral?", "Decreasing prices lead to lower production and wages, decreasing demand further"));
        cards.add(new FlashCard("What is quantitative easing?", "Central bank buys long-term securities to increase money supply and lower interest rates"));
        cards.add(new FlashCard("What are the effects of negative interest rates?", "Charges banks for holding deposits to encourage lending"));
    }
    

    public void shuffle() {
        Collections.shuffle(cards, new Random());
    }

    public FlashCard getNextCard() {
        if (currentIndex < cards.size()) {
            return cards.get(currentIndex++);
        }
        return null; // No more cards
    }

    public boolean hasMoreCards() {
        return currentIndex < cards.size();
    }
}
