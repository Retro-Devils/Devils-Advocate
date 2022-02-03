.class public Lcom/digdroid/alman/dig/q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/h$c;


# instance fields
.field A:I

.field B:I

.field C:I

.field D:I

.field E:I

.field F:I

.field a:Landroid/app/Activity;

.field b:Lcom/digdroid/alman/dig/t3;

.field c:Landroid/database/Cursor;

.field d:Landroid/database/sqlite/SQLiteDatabase;

.field e:Ljava/util/regex/Pattern;

.field f:Lcom/digdroid/alman/dig/h3;

.field g:Lcom/digdroid/alman/dig/o0;

.field h:Ljava/lang/String;

.field i:Lcom/digdroid/alman/dig/c3;

.field j:Landroid/content/res/Resources;

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Ljava/lang/String;

.field n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field p:Ljava/lang/String;

.field q:Landroid/net/Uri;

.field r:Landroid/net/Uri;

.field s:Z

.field t:F

.field u:F

.field v:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q0;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q0;->p:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q0;->q:Landroid/net/Uri;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q0;->r:Landroid/net/Uri;

    iput-object p1, p0, Lcom/digdroid/alman/dig/q0;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->b:Lcom/digdroid/alman/dig/t3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/q0;->c:Landroid/database/Cursor;

    invoke-virtual {p6}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->d:Landroid/database/sqlite/SQLiteDatabase;

    iput-object p7, p0, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/digdroid/alman/dig/q0;->s:Z

    iput p5, p0, Lcom/digdroid/alman/dig/q0;->t:F

    iput p4, p0, Lcom/digdroid/alman/dig/q0;->u:F

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->i:Lcom/digdroid/alman/dig/c3;

    invoke-static {p1, p8}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object p2

    new-instance p4, Lcom/digdroid/alman/dig/i2;

    const-string p5, "Covers"

    invoke-direct {p4, p2, p5}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p5, Lcom/digdroid/alman/dig/i2;

    const-string p7, "Screenshots"

    invoke-direct {p5, p2, p7}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p4}, Lcom/digdroid/alman/dig/i2;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->l:Ljava/lang/String;

    invoke-virtual {p5}, Lcom/digdroid/alman/dig/i2;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->m:Ljava/lang/String;

    const-string p2, "://"

    invoke-virtual {p8, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->l:Ljava/lang/String;

    const-string p4, "/document/"

    invoke-virtual {p2, p4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    iget-object p5, p0, Lcom/digdroid/alman/dig/q0;->l:Ljava/lang/String;

    const/4 p7, 0x0

    invoke-virtual {p5, p7, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p5

    iput-object p5, p0, Lcom/digdroid/alman/dig/q0;->q:Landroid/net/Uri;

    iget-object p5, p0, Lcom/digdroid/alman/dig/q0;->l:Ljava/lang/String;

    add-int/lit8 p2, p2, 0xa

    invoke-virtual {p5, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->o:Ljava/lang/String;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->m:Ljava/lang/String;

    invoke-virtual {p2, p4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    iget-object p4, p0, Lcom/digdroid/alman/dig/q0;->m:Ljava/lang/String;

    invoke-virtual {p4, p7, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p4

    iput-object p4, p0, Lcom/digdroid/alman/dig/q0;->r:Landroid/net/Uri;

    iget-object p4, p0, Lcom/digdroid/alman/dig/q0;->m:Ljava/lang/String;

    add-int/lit8 p2, p2, 0xa

    invoke-virtual {p4, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->p:Ljava/lang/String;

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/digdroid/alman/dig/h2;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object p4

    invoke-virtual {p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "/Systems/icons"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->n:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p6}, Lcom/digdroid/alman/dig/h3;->r(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/h3;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->f:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p6}, Lcom/digdroid/alman/dig/o0;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/o0;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->g:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q0;->j:Landroid/content/res/Resources;

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/q0;->k:Ljava/lang/String;

    const-string p1, "^.+\\/([^\\.]+)\\.[^\\.]+$"

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/q0;->e:Ljava/util/regex/Pattern;

    const-string p1, "title"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->v:I

    const-string p1, "released"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->w:I

    const-string p1, "system"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->x:I

    const-string p1, "time_played"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->y:I

    const-string p1, "times_played"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->z:I

    const-string p1, "filename"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->A:I

    const-string p1, "foldername"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->F:I

    const-string p1, "has_images"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->B:I

    const-string p1, "rating"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->C:I

    const-string p1, "c_rating"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->D:I

    const-string p1, "c_rating_count"

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/q0;->E:I

    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q0;->c:Landroid/database/Cursor;

    return-void
.end method

.method public b(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatRatingBar;Landroid/widget/TextView;I)V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/q0;->c:Landroid/database/Cursor;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q0;->c:Landroid/database/Cursor;

    invoke-interface {v0, p6}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p6

    if-nez p6, :cond_0

    goto :goto_0

    :cond_0
    iget-object v6, p0, Lcom/digdroid/alman/dig/q0;->c:Landroid/database/Cursor;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/q0;->c(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatRatingBar;Landroid/widget/TextView;Landroid/database/Cursor;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatRatingBar;Landroid/widget/TextView;Landroid/database/Cursor;)V
    .locals 2

    if-eqz p6, :cond_b

    invoke-interface {p6}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q0;->a:Landroid/app/Activity;

    invoke-virtual {p0, p1, v0, p6}, Lcom/digdroid/alman/dig/q0;->k(Landroid/widget/ImageView;Landroid/content/Context;Landroid/database/Cursor;)V

    :cond_1
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/q0;->s:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    if-eqz p2, :cond_3

    iget p1, p0, Lcom/digdroid/alman/dig/q0;->v:I

    invoke-interface {p6, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 p2, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "crating"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p2, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "date"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 p2, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "system"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 p2, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "rating"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 p2, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "played"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 p2, 0x0

    :goto_0
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    iget p1, p0, Lcom/digdroid/alman/dig/q0;->D:I

    invoke-interface {p6, p1}, Landroid/database/Cursor;->getFloat(I)F

    move-result p1

    if-eqz p4, :cond_9

    invoke-virtual {p4, p1}, Landroid/widget/RatingBar;->setRating(F)V

    :cond_9
    if-eqz p5, :cond_b

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    float-to-double p3, p1

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p3, p3, v0

    invoke-static {p3, p4}, Ljava/lang/Math;->round(D)J

    move-result-wide p3

    long-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p3, v0

    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/digdroid/alman/dig/q0;->E:I

    invoke-interface {p6, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_1
    if-eqz p3, :cond_b

    iget p1, p0, Lcom/digdroid/alman/dig/q0;->w:I

    invoke-interface {p6, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/q0;->d(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :pswitch_2
    if-eqz p3, :cond_b

    iget-object p1, p0, Lcom/digdroid/alman/dig/q0;->f:Lcom/digdroid/alman/dig/h3;

    iget p2, p0, Lcom/digdroid/alman/dig/q0;->x:I

    invoke-interface {p6, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/h3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_3
    iget p1, p0, Lcom/digdroid/alman/dig/q0;->C:I

    invoke-interface {p6, p1}, Landroid/database/Cursor;->isNull(I)Z

    move-result p1

    if-eqz p1, :cond_a

    const/4 p1, 0x0

    goto :goto_2

    :cond_a
    iget p1, p0, Lcom/digdroid/alman/dig/q0;->C:I

    invoke-interface {p6, p1}, Landroid/database/Cursor;->getFloat(I)F

    move-result p1

    :goto_2
    if-eqz p4, :cond_b

    invoke-virtual {p4, p1}, Landroid/widget/RatingBar;->setRating(F)V

    goto :goto_3

    :pswitch_4
    if-eqz p3, :cond_b

    iget-object p1, p0, Lcom/digdroid/alman/dig/q0;->a:Landroid/app/Activity;

    invoke-virtual {p0, p1, p6}, Lcom/digdroid/alman/dig/q0;->f(Landroid/content/Context;Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_b
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3ac1652d -> :sswitch_4
        -0x37ea4e63 -> :sswitch_3
        -0x34e38dd1 -> :sswitch_2
        0x2eefae -> :sswitch_1
        0x3d1e9bc0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method d(J)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-lez v3, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p2, 0x1

    invoke-virtual {v1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method e(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 5

    iget-object p3, p0, Lcom/digdroid/alman/dig/q0;->f:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p3, p1}, Lcom/digdroid/alman/dig/h3;->w(Ljava/lang/String;)Z

    move-result p3

    const-string v0, ".png"

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz p2, :cond_2

    if-nez p2, :cond_0

    iget-object v3, p0, Lcom/digdroid/alman/dig/q0;->b:Lcom/digdroid/alman/dig/t3;

    iget-object v3, v3, Lcom/digdroid/alman/dig/t3;->v:Ljava/lang/String;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q0;->b:Lcom/digdroid/alman/dig/t3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t3;->v:Ljava/lang/String;

    invoke-static {p2, v1}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object p2

    new-instance v1, Lcom/digdroid/alman/dig/i2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/i2;->m()Landroid/net/Uri;

    move-result-object v2

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    and-int/lit8 v1, p2, 0x1

    if-nez v1, :cond_2

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    goto :goto_0

    :cond_1
    and-int/lit8 v3, p2, 0x2

    if-nez v3, :cond_2

    and-int/2addr p2, v1

    if-eqz p2, :cond_2

    const/4 p3, 0x1

    :cond_2
    :goto_0
    if-nez v2, :cond_8

    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->q:Landroid/net/Uri;

    const-string v1, "/"

    if-eqz p2, :cond_6

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-ge v2, v3, :cond_3

    goto :goto_3

    :cond_3
    if-eqz p3, :cond_4

    goto :goto_1

    :cond_4
    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->r:Landroid/net/Uri;

    :goto_1
    if-eqz p3, :cond_5

    iget-object p3, p0, Lcom/digdroid/alman/dig/q0;->o:Ljava/lang/String;

    goto :goto_2

    :cond_5
    iget-object p3, p0, Lcom/digdroid/alman/dig/q0;->p:Ljava/lang/String;

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    goto :goto_5

    :cond_6
    :goto_3
    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->a:Landroid/app/Activity;

    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/digdroid/alman/dig/q0;->l:Ljava/lang/String;

    goto :goto_4

    :cond_7
    iget-object p3, p0, Lcom/digdroid/alman/dig/q0;->m:Ljava/lang/String;

    :goto_4
    invoke-static {p2, p3}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object p2

    new-instance p3, Lcom/digdroid/alman/dig/i2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p2, p1}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/digdroid/alman/dig/i2;->m()Landroid/net/Uri;

    move-result-object v2

    :cond_8
    :goto_5
    return-object v2
.end method

.method f(Landroid/content/Context;Landroid/database/Cursor;)Ljava/lang/String;
    .locals 12

    iget v0, p0, Lcom/digdroid/alman/dig/q0;->z:I

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "X"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-lez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x7f1101ef

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Lcom/digdroid/alman/dig/q0;->y:I

    invoke-interface {p2, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    const-wide/16 v4, 0xe10

    div-long v6, v2, v4

    const-wide/16 v8, 0x0

    cmp-long p2, v6, v8

    if-lez p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const v0, 0x7f11011c

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    rem-long v4, v2, v4

    const-wide/16 v10, 0x3c

    div-long/2addr v4, v10

    cmp-long p2, v4, v8

    if-gtz p2, :cond_1

    cmp-long p2, v6, v8

    if-lez p2, :cond_2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const v0, 0x7f11018d

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    rem-long/2addr v2, v10

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const v0, 0x7f110233

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method g(Landroid/database/Cursor;)J
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/q0;->w:I

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method h(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q0;->f:Lcom/digdroid/alman/dig/h3;

    iget v1, p0, Lcom/digdroid/alman/dig/q0;->x:I

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/h3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroid/view/View;F)Lcom/digdroid/alman/dig/x0;
    .locals 2

    const v0, 0x7f0901a9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/SquaredImageView;

    iget v1, p0, Lcom/digdroid/alman/dig/q0;->t:F

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lcom/digdroid/alman/dig/q0;->t:F

    mul-float p2, p2, v1

    iget v1, p0, Lcom/digdroid/alman/dig/q0;->u:F

    mul-float p2, p2, v1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    const/4 v1, -0x2

    invoke-direct {v0, p2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Lcom/digdroid/alman/dig/x0;

    invoke-direct {p2, p1}, Lcom/digdroid/alman/dig/x0;-><init>(Landroid/view/View;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q0;->b:Lcom/digdroid/alman/dig/t3;

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/q0;->s:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    invoke-virtual {p2, p1, v0, v1}, Lcom/digdroid/alman/dig/x0;->N(Lcom/digdroid/alman/dig/t3;ZLjava/lang/String;)V

    return-object p2
.end method

.method j(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;ILandroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    :try_start_0
    iget-object p3, p0, Lcom/digdroid/alman/dig/q0;->a:Landroid/app/Activity;

    invoke-static {p3}, Lcom/digdroid/alman/dig/l1;->a(Landroid/app/Activity;)Lcom/digdroid/alman/dig/o1;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/digdroid/alman/dig/o1;->J(Landroid/net/Uri;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/n1;->G0(Landroid/graphics/drawable/Drawable;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/n1;->D0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    :goto_0
    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n1;->V0(Z)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->a:Landroid/app/Activity;

    invoke-static {p2}, Lcom/digdroid/alman/dig/l1;->a(Landroid/app/Activity;)Lcom/digdroid/alman/dig/o1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/o1;->J(Landroid/net/Uri;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/digdroid/alman/dig/n1;->F0(I)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/n1;->D0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :goto_1
    return-void
.end method

.method k(Landroid/widget/ImageView;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 8

    iget v0, p0, Lcom/digdroid/alman/dig/q0;->x:I

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/q0;->f:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/h3;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/digdroid/alman/dig/q0;->F:I

    invoke-interface {p3, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "android"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    iget v2, p0, Lcom/digdroid/alman/dig/q0;->A:I

    invoke-interface {p3, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v5, "pc"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "scumm"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const/16 v5, 0x2e

    invoke-virtual {v2, v5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    if-lez v5, :cond_0

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_0
    const/4 v5, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v6, "drawable"

    const-string v7, "icon_grayed_"

    if-eqz v3, :cond_1

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->j:Landroid/content/res/Resources;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/digdroid/alman/dig/q0;->k:Ljava/lang/String;

    invoke-virtual {p2, v3, v6, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/q0;->j:Landroid/content/res/Resources;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/digdroid/alman/dig/q0;->k:Ljava/lang/String;

    invoke-virtual {p2, v3, v6, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_2

    const v4, 0x7f0700e6

    :cond_2
    :goto_0
    iget p2, p0, Lcom/digdroid/alman/dig/q0;->B:I

    invoke-interface {p3, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, -0x1

    goto :goto_1

    :cond_3
    iget p2, p0, Lcom/digdroid/alman/dig/q0;->B:I

    invoke-interface {p3, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    :goto_1
    invoke-virtual {p0, v0, p2, v1, v2}, Lcom/digdroid/alman/dig/q0;->e(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p0, p2, v5, v4, p1}, Lcom/digdroid/alman/dig/q0;->j(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;ILandroid/widget/ImageView;)V

    return-void
.end method
