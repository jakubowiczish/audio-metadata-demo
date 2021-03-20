const mm = require('music-metadata');
const util = require('util');

function printMetadata(filepath) {
    (async () => {
        try {
            const metadata = await mm.parseFile(filepath);
            console.log(util.inspect(metadata, {showHidden: false, depth: null}));
        } catch (error) {
            console.error(error.message);
        }
    })();
}

printMetadata('KDA-MORE2.mp3')