.class Lcom/digdroid/alman/dig/f1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/l0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f1;->f3(Landroid/view/View;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/digdroid/alman/dig/f1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f1;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f1$d;->d:Lcom/digdroid/alman/dig/f1;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/f1$d;->a:J

    iput-object p4, p0, Lcom/digdroid/alman/dig/f1$d;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/digdroid/alman/dig/f1$d;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/f1$d;->d:Lcom/digdroid/alman/dig/f1;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/f1$d;->a:J

    iget-object v4, p0, Lcom/digdroid/alman/dig/f1$d;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/digdroid/alman/dig/f1$d;->c:Ljava/lang/String;

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/f1;->A3(Landroid/view/MenuItem;JLjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
