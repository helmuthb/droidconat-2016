package at.droidcon.vienna2016.ui.home;

import android.support.annotation.StringRes;

import java.util.List;

import at.droidcon.vienna2016.data.app.model.Session;

/**
 * Created by helmuth on 25/08/16.
 */

public interface HomeMvp {
    interface View {
        void updateAnnouncement(String title, String text);

        void hideAnnouncement();

        void setComingNext(@StringRes int title, @StringRes int text);

        void setComingNext(@StringRes int title, List<Session> sessions);

        void setIsLoading(boolean isLoading);
    }
    interface Presenter {

    }
}
