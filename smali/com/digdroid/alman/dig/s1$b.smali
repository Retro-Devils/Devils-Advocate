.class Lcom/digdroid/alman/dig/s1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s1;->i3()Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:I

.field final synthetic f:Lcom/digdroid/alman/dig/s1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s1;ILjava/lang/String;JI)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s1$b;->f:Lcom/digdroid/alman/dig/s1;

    iput p2, p0, Lcom/digdroid/alman/dig/s1$b;->b:I

    iput-object p3, p0, Lcom/digdroid/alman/dig/s1$b;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/digdroid/alman/dig/s1$b;->d:J

    iput p6, p0, Lcom/digdroid/alman/dig/s1$b;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/s1$b;->f:Lcom/digdroid/alman/dig/s1;

    iget v1, p0, Lcom/digdroid/alman/dig/s1$b;->b:I

    iget-object v2, p0, Lcom/digdroid/alman/dig/s1$b;->c:Ljava/lang/String;

    iget-wide v3, p0, Lcom/digdroid/alman/dig/s1$b;->d:J

    iget v5, p0, Lcom/digdroid/alman/dig/s1$b;->e:I

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/s1;->F3(ILjava/lang/String;JI)V

    return-void
.end method
