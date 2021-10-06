
DRM_LEASE_DEVICE = "${@bb.utils.contains("AGL_FEATURES", "kingfisher", "card0-HDMI-A-1", "card0-HDMI-A-1" ,d)}"
