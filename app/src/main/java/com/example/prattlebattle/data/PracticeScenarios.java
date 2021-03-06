package com.example.prattlebattle.data;

import com.example.prattlebattle.R;
import com.example.prattlebattle.model.PracticeAction;
import com.example.prattlebattle.model.PracticeScenario;

public class PracticeScenarios {

    private final static PracticeScenario scenario1 = new PracticeScenario("Practice 1: Empathic listening",
            "You are at school and you see your friend Patty. You think of approaching her, but first you should determine her emotions to act accordingly. Based on her body language, how is Patty feeling?", R.drawable.pr1,
            new PracticeAction[]{
                    new PracticeAction("Sad or angry", "Great choice! She is frowning and her shoulders are hunched. ", true, null),
                    new PracticeAction("Happy", "Look at her mouth, eyebrows and shoulders.", false, 1),
                    new PracticeAction("Surprised", "Look at her mouth, eyebrows and shoulders.", false, 2)
            }
    );

    private final static PracticeScenario scenario2 = new PracticeScenario("Practice 1: Empathic listening",
            "What will you do?", R.drawable.pr1,
            new PracticeAction[]{
                    new PracticeAction("Approach her", "Great choice! Even though she is sad, trying to make her feel better is worthwhile. You are a good friend.", true, null),
                    new PracticeAction("Walk away", "Patty is your friend. If you approach her, you may make her feel better. We have learned together how to perform active listening, so you should at least try.", false, 1)
            }
    );

    private final static PracticeScenario scenario3 = new PracticeScenario("Practice 1: Empathic listening",
            "", R.drawable.pr2,
            new PracticeAction[]{
                    new PracticeAction("Say: \"Hi, Patty.\"", "Moving forwards.", true, null),

            }
    );
    private final static PracticeScenario scenario4 = new PracticeScenario("Practice 1: Empathic listening",
            "Patty: \"Hello\"", R.drawable.pr2,
            new PracticeAction[]{
                    new PracticeAction("Say \"You seem upset. What's the matter?\"", "Great choice! Asking open-ended questions encourages the other person to speak freely.", true, null),
                    new PracticeAction("Act like you haven't noticed and start talking about yourself.", "Patty is your friend. Showing empathy to your friends and trying to help is always a good choice. Even if she prefers not to share, it is great that you've at least tried.", false, 1)

            }
    );
    private final static PracticeScenario scenario5 = new PracticeScenario("Practice 1: Empathic listening",
            "Patty: \"Oh, i got into an argument with my sister yesterday and we still haven't talked since. We act like we don't know each other!\"", R.drawable.pr3,
            new PracticeAction[]{
                    new PracticeAction("Say \"I see. Why though?\"", "Great choice! Yet another open-ended question, which also shows engagement.", true, null),
                    new PracticeAction("Change the topic", "Empathic listening is all about seeking to understand the other individual, not avoiding talking about their concerns.", false, 1),

            }
    );
    private final static PracticeScenario scenario6 = new PracticeScenario("Practice 1: Empathic listening",
            "Patty: \"So, usually, my sister and I take turns doing the chores every day. Yesterday, before my mum went to work, she told us to wash the dishes. On schedule, it was my turn; however, the day before, when it was my sister's turn, i helped her out. Because i did most of the work, i assumed that she would be in charge yesterday.\"", R.drawable.pr3,
            new PracticeAction[]{
                    new PracticeAction("Continue to listen", "Moving forwards", true, null),


            }
    );
    private final static PracticeScenario scenario7 = new PracticeScenario("Practice 1: Empathic listening",
            "Patty: \"But she had other ideas - i was the one who had to do the washing. So, I stayed in my room all day, watched movies and i didn't give the housekeeping any further thought. When our mum got home, she was mad at us, because no one had done anything.\"", R.drawable.pr3,
            new PracticeAction[]{
                    new PracticeAction("Paraphrase what was said : \"So, basically, both of you thought that the other one would do the washing. And as a result, no one did, right?\"", "Great choice. Summing up aids comprehension and ensures the speaker that you are listening", true, null),
                    new PracticeAction("Say : \"You should go and tell your sister that she is wrong.\"", "Try not to offer your advice and opinion when they haven't been requested. Often times, the aim of empathic listening is to just let the other person share their concerns and let some steam off.", false, 1),


            }
    );
    private final static PracticeScenario scenario8 = new PracticeScenario("Practice 1: Empathic listening",
            "Patty: \"Exactly! When our mum yelled at us, my sister and i started pointing fingers at each other, which lead to a heated argument. We haven't talked since. I miss her and that makes me upset. What should i do?\"", R.drawable.pr3,
            new PracticeAction[]{
                    new PracticeAction("Say : \"If I were you, i would try to talk to her about it. In my opinion, no one is wrong or right, the situation seems to be a misunderstanding.\"", "This is an example of a good answer. You gave advice when it was specifically requested; your opinion was not too extreme, but aided by critical listening. ", true, null),



            }
    );
    private final static PracticeScenario scenario9 = new PracticeScenario("Practice 1: Empathic listening",
            "Patty : \" I guess you are right, i may try talking to her. Thank you for listening, I feel much better now. Wanna go to class together?\"", R.drawable.pr3,
            new PracticeAction[]{
                    new PracticeAction("Say : \"Sure, let's go.\"", "This is the end of the practice. Good job!", true, null),



            }
    );




    public final static PracticeScenario[] practiceScenarios = {scenario1, scenario2, scenario3, scenario4, scenario5, scenario6, scenario7, scenario8, scenario9};
}
