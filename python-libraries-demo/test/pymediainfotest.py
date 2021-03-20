from pymediainfo import MediaInfo


def print_media_info(file):
    media_info = MediaInfo.parse(file)
    print("\nMediaInfo")
    for i in media_info.tracks:
        print(i.to_data().values())
