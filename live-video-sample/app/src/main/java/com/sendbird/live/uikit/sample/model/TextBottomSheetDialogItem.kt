package com.sendbird.live.uikit.sample.model

import androidx.annotation.StringRes
import androidx.annotation.StyleRes

internal data class TextBottomSheetDialogItem(
    val id: Int,
    @StringRes val title: Int,
    @StyleRes val textStyle: Int? = null,
    var isSelected: Boolean = false
)
