import * as React from 'react';
import { WithStyles, withStyles } from '@material-ui/core/styles';
import {styles} from './styles';

const GRID_SIZE = 40;

// TODO move the message block to a separate component
const Board = (props: WithStyles<any>) => {
    this.props.board.size = 6;
    var intersections = [];
    for (var i = 0; i < this.props.board.size; i++)
        for (var j = 0; j < this.props.board.size; j++)
            intersections.push(BoardIntersection({
                board: this.props.board,
                color: this.props.board.board[i][j],
                row: i,
                col: j,
                onPlay: this.props.onPlay
            }));
    var style = {
        width: this.props.board.size * GRID_SIZE,
        height: this.props.board.size * GRID_SIZE
    };
    return <div style={style} id="board">{intersections}</div>
};

export default withStyles(styles)(Board);
