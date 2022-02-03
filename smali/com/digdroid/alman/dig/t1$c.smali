.class Lcom/digdroid/alman/dig/t1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1;->m(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/digdroid/alman/dig/p1;

.field final synthetic c:J

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/digdroid/alman/dig/t1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$c;->f:Lcom/digdroid/alman/dig/t1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t1$c;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$c;->b:Lcom/digdroid/alman/dig/p1;

    iput-wide p4, p0, Lcom/digdroid/alman/dig/t1$c;->c:J

    iput-object p6, p0, Lcom/digdroid/alman/dig/t1$c;->d:Ljava/lang/String;

    iput-object p7, p0, Lcom/digdroid/alman/dig/t1$c;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$c;->f:Lcom/digdroid/alman/dig/t1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$c;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$c;->b:Lcom/digdroid/alman/dig/p1;

    iget-wide v3, p0, Lcom/digdroid/alman/dig/t1$c;->c:J

    iget-object v5, p0, Lcom/digdroid/alman/dig/t1$c;->d:Ljava/lang/String;

    iget-object v6, p0, Lcom/digdroid/alman/dig/t1$c;->e:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/t1;->n(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
