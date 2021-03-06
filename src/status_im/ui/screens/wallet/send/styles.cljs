(ns status-im.ui.screens.wallet.send.styles
  (:require-macros [status-im.utils.styles :refer [defnstyle defstyle]])
  (:require [status-im.components.styles :as styles]))

(def wallet-container
  {:flex             1
   :background-color styles/color-white})

(def wallet-modal-container
  {:flex             1
   :background-color styles/color-blue4})

(defstyle toolbar
  {:ios     {:background-color styles/color-blue4}
   :android {:background-color styles/color-blue5
             :elevation        0}})

(def toolbar-title-container
  {:flex           1
   :flex-direction :row
   :margin-left    6})

(def toolbar-title-text
  {:color        styles/color-white
   :font-size    17
   :margin-right 4})

(def toolbar-icon
  {:width  24
   :height 24})

(def toolbar-title-icon
  (merge toolbar-icon {:opacity 0.4}))