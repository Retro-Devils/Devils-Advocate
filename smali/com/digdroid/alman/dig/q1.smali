.class public abstract Lcom/digdroid/alman/dig/q1;
.super Landroid/widget/CursorAdapter;
.source ""


# instance fields
.field b:Lcom/digdroid/alman/dig/s3;

.field c:Landroid/database/Cursor;

.field d:F

.field e:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;F)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, v0}, Landroid/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/q1;->c:Landroid/database/Cursor;

    iput p4, p0, Lcom/digdroid/alman/dig/q1;->d:F

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/q1;->e:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q1;->c:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_0
    return-void
.end method

.method b(J)Ljava/lang/String;
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
