package cat.smartcoding.mendez.freedating_2.ui.mailbox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cat.smartcoding.mendez.freedating_2.R

class MailBoxFragment : Fragment() {

    companion object {
        fun newInstance() = MailBoxFragment()
    }

    private lateinit var viewModel: MailBoxViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mail_box_fragment, container, false)
    }


}