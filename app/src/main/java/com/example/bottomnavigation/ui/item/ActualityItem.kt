package com.example.bottomnavigation.ui.item

import android.view.View
import com.example.bottomnavigation.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import kotlinx.android.synthetic.main.card_invitation.view.*

class ActualityItem: AbstractItem<ActualityItem, ActualityItem.ActualityItemViewHolder>() {
    override fun getType(): Int {
        return R.id.textViewChallengeInProgressTitle
    }

    override fun getViewHolder(v: View?): ActualityItemViewHolder {
        return ActualityItemViewHolder(v)
    }

    override fun getLayoutRes(): Int {
        return R.layout.card_actuality
    }

    class ActualityItemViewHolder(itemView: View?): FastAdapter.ViewHolder<ActualityItem>(itemView) {
        override fun unbindView(item: ActualityItem?) {
            itemView.textViewActualityItemTitle.text = null
        }

        override fun bindView(item: ActualityItem?, payloads: MutableList<Any>?) {

            // tu dois pouvoir récupérer l'objet de ton item
            // ex : val challengeInProgress = item.challengeInProgress

            // ex : itemView.textViewChallengeInProgressTitle.text = challengeInProgress.title

            itemView.textViewActualityItemTitle.text = "Félicitation !"
        }

    }

}