package com.example.bottomnavigation.ui.item

import android.view.View
import com.example.bottomnavigation.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import kotlinx.android.synthetic.main.card.view.*
import kotlinx.android.synthetic.main.card_invitation.view.*

class InvitationItem: AbstractItem<InvitationItem, InvitationItem.InvitationItemViewHolder>() {
    override fun getType(): Int {
        return R.id.textViewChallengeInProgressTitle
    }

    override fun getViewHolder(v: View?): InvitationItemViewHolder {
        return InvitationItemViewHolder(v)
    }

    override fun getLayoutRes(): Int {
        return R.layout.card_invitation
    }

    class InvitationItemViewHolder(itemView: View?): FastAdapter.ViewHolder<InvitationItem>(itemView) {
        override fun unbindView(item: InvitationItem?) {
            itemView.textViewInvitationItemTitle.text = null
        }

        override fun bindView(item: InvitationItem?, payloads: MutableList<Any>?) {

            // tu dois pouvoir récupérer l'objet de ton item
            // ex : val challengeInProgress = item.challengeInProgress

            // ex : itemView.textViewChallengeInProgressTitle.text = challengeInProgress.title

            itemView.textViewInvitationItemTitle.text = "Lucille"
        }

    }

}