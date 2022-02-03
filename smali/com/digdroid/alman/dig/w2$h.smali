.class Lcom/digdroid/alman/dig/w2$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/w2;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/w2$b;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lcom/digdroid/alman/dig/w2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/w2$h;->b:Lcom/digdroid/alman/dig/w2$b;

    iput-object p3, p0, Lcom/digdroid/alman/dig/w2$h;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/w2$h;->b:Lcom/digdroid/alman/dig/w2$b;

    iget-boolean p2, p2, Lcom/digdroid/alman/dig/w2$b;->b:Z

    const-string v0, "share_ratings"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/w2$h;->b:Lcom/digdroid/alman/dig/w2$b;

    iget-boolean p2, p2, Lcom/digdroid/alman/dig/w2$b;->c:Z

    const-string v0, "share_stats"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/w2$h;->b:Lcom/digdroid/alman/dig/w2$b;

    iget-boolean p2, p2, Lcom/digdroid/alman/dig/w2$b;->d:Z

    const-string v0, "dont_ask_to_rate"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    new-instance p1, Lcom/digdroid/alman/dig/w2$k;

    iget-object p2, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/w2$k;-><init>(Lcom/digdroid/alman/dig/w2;)V

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Float;

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    iget v0, v0, Lcom/digdroid/alman/dig/w2;->g:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p2, v1

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$h;->b:Lcom/digdroid/alman/dig/w2$b;

    iget v0, v0, Lcom/digdroid/alman/dig/w2$b;->a:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p2, v1

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2$h;->b:Lcom/digdroid/alman/dig/w2$b;

    iget-boolean p1, p1, Lcom/digdroid/alman/dig/w2$b;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/w2;->c(Lcom/digdroid/alman/dig/w2;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2$h;->c:Landroid/app/Activity;

    iget-object p2, p0, Lcom/digdroid/alman/dig/w2$h;->d:Lcom/digdroid/alman/dig/w2;

    invoke-static {p2}, Lcom/digdroid/alman/dig/w2;->c(Lcom/digdroid/alman/dig/w2;)J

    move-result-wide v0

    iget-object p2, p0, Lcom/digdroid/alman/dig/w2$h;->b:Lcom/digdroid/alman/dig/w2$b;

    iget p2, p2, Lcom/digdroid/alman/dig/w2$b;->a:F

    invoke-static {p1, v0, v1, p2}, Lcom/digdroid/alman/dig/ServerService;->s(Landroid/content/Context;JF)V

    :cond_0
    return-void
.end method
