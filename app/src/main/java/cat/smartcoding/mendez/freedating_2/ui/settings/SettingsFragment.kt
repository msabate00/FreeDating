package cat.smartcoding.mendez.freedating_2.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import cat.smartcoding.mendez.freedating_2.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }

}