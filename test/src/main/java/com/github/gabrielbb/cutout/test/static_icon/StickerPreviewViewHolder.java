/*
 * Copyright (c) WhatsApp Inc. and its affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.github.gabrielbb.cutout.test.static_icon;

import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;
import com.github.gabrielbb.cutout.test.R;

import androidx.recyclerview.widget.RecyclerView;

class StickerPreviewViewHolder extends RecyclerView.ViewHolder {

    final SimpleDraweeView stickerPreviewView;

    StickerPreviewViewHolder(final View itemView) {
        super(itemView);
        stickerPreviewView = itemView.findViewById(R.id.sticker_preview);
    }
}