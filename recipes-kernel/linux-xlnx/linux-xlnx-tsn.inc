SRC_URI += "${@bb.utils.contains('ENABLE_TSN', '1', ' file://tsn-kmeta;type=kmeta;name=tsn-kmeta;destsuffix=tsn-kmeta', '', d)}"

KERNEL_FEATURES:append = "${@bb.utils.contains('ENABLE_TSN', '1', ' features/tsn-extra/tsn-extra.scc', '', d)}"
