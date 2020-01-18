/*
 * Copyright (c) WhatsApp Inc. and its affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.github.gabrielbb.cutout.test.WhatsAppBasedCode;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.gabrielbb.cutout.test.R;

import androidx.recyclerview.widget.RecyclerView;

public class StickerPackListItemViewHolder extends RecyclerView.ViewHolder {

    View container;
    TextView titleView;
    TextView tvNoSticker;
    TextView publisherView;
   TextView filesizeView;
    ImageView addButton;
    ImageView shareButton;
    LinearLayout imageRowView;

    StickerPackListItemViewHolder(final View itemView) {
        super(itemView);
        container = itemView;
        titleView = itemView.findViewById(R.id.sticker_pack_title);
        tvNoSticker = itemView.findViewById(R.id.tvNoSticker);
        publisherView = itemView.findViewById(R.id.sticker_pack_publisher);
        filesizeView = itemView.findViewById(R.id.sticker_pack_filesize);
        addButton = itemView.findViewById(R.id.add_button_on_list);
        shareButton = itemView.findViewById(R.id.export_button_on_list);
        imageRowView = itemView.findViewById(R.id.sticker_packs_list_item_image_list);
    }
}