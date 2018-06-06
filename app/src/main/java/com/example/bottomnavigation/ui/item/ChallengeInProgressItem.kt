package com.example.bottomnavigation.ui.item

import android.view.View
import com.example.bottomnavigation.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import kotlinx.android.synthetic.main.card.view.*

class ChallengeInProgressItem: AbstractItem<ChallengeInProgressItem, ChallengeInProgressItem.ChallengeInProgressViewHolder>() {
    override fun getType(): Int {
        return R.id.textViewChallengeInProgressTitle
    }

    override fun getViewHolder(v: View?): ChallengeInProgressViewHolder {
        return ChallengeInProgressViewHolder(v)
    }

    override fun getLayoutRes(): Int {
        return R.layout.card
    }

    class ChallengeInProgressViewHolder(itemView: View?): FastAdapter.ViewHolder<ChallengeInProgressItem>(itemView) {
        override fun unbindView(item: ChallengeInProgressItem?) {
            itemView.textViewChallengeInProgressTitle.text = null
        }

        override fun bindView(item: ChallengeInProgressItem?, payloads: MutableList<Any>?) {

            // tu dois pouvoir récupérer l'objet de ton item
            // ex : val challengeInProgress = item.challengeInProgress

            // ex : itemView.textViewChallengeInProgressTitle.text = challengeInProgress.title

            itemView.textViewChallengeInProgressTitle.text = "50 km de marche à pieds"
        }

    }

}