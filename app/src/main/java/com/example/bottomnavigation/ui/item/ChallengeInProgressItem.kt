package com.example.bottomnavigation.ui.item

import android.view.View
import com.example.bottomnavigation.R
import com.fasterxml.jackson.databind.util.ClassUtil.getPackageName
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import kotlinx.android.synthetic.main.card.view.*

// "titre", 3, 50, 15
class ChallengeInProgressItem(
        val title: String,
        val daysLeft: String,
        val totalUnitValue: String,
        val unitType: String,
        val totalDays: String,
        val image: String)
    : AbstractItem<ChallengeInProgressItem, ChallengeInProgressItem.ChallengeInProgressViewHolder>() {
    override fun getType(): Int {
        return R.id.labelTitle
    }

    override fun getViewHolder(v: View?): ChallengeInProgressViewHolder {
        return ChallengeInProgressViewHolder(v)
    }

    override fun getLayoutRes(): Int {
        return R.layout.card
    }

    class ChallengeInProgressViewHolder(itemView: View?): FastAdapter.ViewHolder<ChallengeInProgressItem>(itemView) {
        override fun unbindView(item: ChallengeInProgressItem?) {
            itemView.labelTitle.text = null
            itemView.labelDaysLeft.text = null
            itemView.totalUnitValue.text = null
            itemView.unitType.text = null
            itemView.totalDaysValue.text = null
            itemView.imageView15.background = null
        }

        override fun bindView(item: ChallengeInProgressItem?, payloads: MutableList<Any>?) {

            // tu dois pouvoir récupérer l'objet de ton item
            // ex : val challengeInProgress = item.challengeInProgress

            // ex : itemView.textViewChallengeInProgressTitle.text = challengeInProgress.title

            itemView.labelTitle.text = item?.title
            itemView.labelDaysLeft.text = item?.daysLeft.plus(" jours restants")
            itemView.totalUnitValue.text = item?.totalUnitValue
            itemView.unitType.text = item?.unitType
            itemView.totalDaysValue.text = item?.totalDays
            //itemView.imageView15.background = R.drawable.card_felicitations
            //itemView.imageView15.setImageResource(R.drawable[item?.image])
            //itemView.imageView15.setImageResource(getResources().getIdentifier(item?.image, "drawable", getPackageName())) // TODO à fixer
        }

    }

}