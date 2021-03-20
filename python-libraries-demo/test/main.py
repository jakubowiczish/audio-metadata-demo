from test.mutagentest import print_metadata
from test.pymediainfotest import print_media_info

if __name__ == '__main__':
    file = "KDA-MORE2.mp3"
    print_media_info(file)
    print_metadata(file)
