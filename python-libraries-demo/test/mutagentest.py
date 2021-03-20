from mutagen.easyid3 import EasyID3


def print_metadata(file):
    f = EasyID3(file)
    print(f)
