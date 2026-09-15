SUMMARY = "Open-LLDP"
DESCRIPTION = "Link Layer Discovery Protocol for Linux that includes support for DCBX"
HOMEPAGE = "http://open-lldp.org/start"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8c2bc283e65df398ced5f5b747e78162"


inherit pkgconfig autotools
inherit ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)}

DEPENDS = "libnl libconfig readline"

SRCREV = "5d96bd0aff4606fad66f6c613b644c82fe8d2445"
PV .= "+git"
SRC_URI = "git://github.com/intel/openlldp.git;protocol=https;branch=branch-1.2 \
           file://0001-Fix-musl-libc-build-issue.patch \
           file://0001-autotools-Add-include-path-to-generated-version.h.patch \
           file://0001-autotools-Add-option-to-disable-installation-of-syst.patch \
           "

# Enable install of systemd conf files.
EXTRA_OECONF += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '--with-systemdsystemunitdir=${systemd_system_unitdir}', '', d)}"

SYSTEMD_SERVICE:${PN} = "lldpad.service lldpad.socket"

SYSTEMD_AUTO_ENABLE ?= "enable"

RRECOMMENDS:${PN} = "iproute2-tc"
